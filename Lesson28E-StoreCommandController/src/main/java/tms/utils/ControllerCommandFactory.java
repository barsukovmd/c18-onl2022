package tms.utils;
import lombok.experimental.UtilityClass;
import tms.controller.CommandController;
import tms.controller.impl.*;
import tms.model.Commands;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static tms.utils.InjectObjectsFactory.createAndInjectInstances;

@UtilityClass
public class ControllerCommandFactory {

    private static final Map<String, CommandController> COMMANDS = new ConcurrentHashMap<>();

    public static CommandController defineCommand(Commands command) throws Exception {
        return putIfAbsent(command.getCommand(), createController(command));
    }

    private static Supplier<CommandController> createController(Commands command) {
        return switch (command) {
            case HOME_PAGE_COMMAND -> HomePageCommandController::new;
            case PRODUCTS_PAGE_COMMAND -> ProductPageCommandController::new;
            case ACCOUNT_PAGE_COMMAND -> AccountPageCommandController::new;
            case ADD_CART_PAGE_COMMAND -> AddCartPageCommandController::new;
            case ADD_FAVORITE_PAGE_COMMAND -> AddFavoritePageCommandController::new;
            case LOGIN_PAGE_COMMAND -> LoginPageCommandController::new;
            case LOGIN_PAGE_POST_COMMAND -> LoginPagePostCommandController::new;
            case CREATE_USER_PAGE_COMMAND -> CreateUserPageCommandController::new;
            case CREATE_USER_PAGE_POST_COMMAND -> CreateUserPagePostCommandController::new;
            case DELETE_CART_PRODUCT_PAGE_COMMAND -> DeleteCartProductPageCommandController::new;
            case DELETE_FAVORITE_PRODUCT_PAGE_COMMAND -> DeleteFavoriteCommandController::new;
            case FAVORITES_PAGE_COMMAND -> FavoritesCommandController::new;
            case LOGOUT_PAGE_COMMAND -> LogoutPageCommandController::new;
            case SHOPPING_CART_PAGE_COMMAND -> ShoppingCartPageCommandController::new;
            case SHOPPING_CART_PAGE_POST_COMMAND -> ShoppingCartPagePostCommandController::new;
            case SEARCH_PAGE_COMMAND -> SearchPageCommandController::new;
            case SEARCH_PAGE_POST_COMMAND -> SearchPagePostCommandController::new;
            case PRODUCT_PAGE_COMMAND -> OneProductPageCommandController::new;
            case FILTER_PAGE_COMMAND -> SearchFilterPageCommandController::new;
        };
    }

    private static CommandController putIfAbsent(String key, Supplier<CommandController> supplier) throws Exception {
        CommandController value = COMMANDS.get(key);
        if (value == null) {
            value = create(supplier);
            COMMANDS.put(key, value);
        }
        return value;
    }

    private static CommandController create(Supplier<CommandController> supplier) throws Exception {
        CommandController baseController = supplier.get();
        createAndInjectInstances(baseController);
        return baseController;
    }
}