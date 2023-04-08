package by.tms.onlinestore.utils;

import by.tms.onlinestore.model.Product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductHelper {
    public static final List<Product> products =
            Arrays.asList(new Product(1, "mobileApple.jpg",
                            "Smartphone Apple iPhone 13 128GB (dark night)",
                            "Apple iOS, screen 6.1'' OLED (1170x2532), Apple A15 Bionic, 4 gb, ssd-memory 128 ГБ, " +
                                    "camera 12 Мп, battery 3227 mAh, 1 SIM",
                            new BigDecimal("2600"), 1),
                    new Product(2, "mobileSamsung.jpg",
                            "Smartphone Samsung Galaxy A52 SM-A525F/DS 8GB/256GB (blue)",
                            "Android, screen 6.5'' AMOLED (1080x2400), Qualcomm Snapdragon 720G, 8 ГБ, ssd-memory 256 ГБ," +
                                    " memory card, camera 64 Мп, battery 4500 mAh, 2 SIM",
                            new BigDecimal("1200"), 1),
                    new Product(3, "laptopLenovo.jpg",
                            "Gaming laptop Lenovo Legion 5 15ACH6H 82JU00A1PB",
                            "15.6'' 1920 x 1080 IPS, 120 Гц, non-sensor, AMD Ryzen 7 5800H 3200 Mgc, 16 ГБ DDR4," +
                                    " SSD 512 ГБ, video NVIDIA GeForce RTX 3060 6 ГБ, Windows 10",
                            new BigDecimal("5500"), 2),
                    new Product(4, "laptopAcer.jpg",
                            "Игровой ноутбук Acer Nitro 5 AN515-45-R1A6 NH.QBREP.00B",
                            "15.6'' 1920 x 1080 IPS, 144 Гц, non-sensor, AMD Ryzen 5 5600H 3300 Mgc, 16 ГБ DDR4," +
                                    " SSD 1024 ГБ, video NVIDIA GeForce RTX 3070 8 ГБ, Linux",
                            new BigDecimal("5000"), 2),
                    new Product(5, "navigatorGeofox.jpg",
                            "GPS navigation GEOFOX MID502GPS",
                            "экран 5'' TFT (800 x 480), 128 Мб, 8 Гб, Windows CE 6.0",
                            new BigDecimal("222"), 3),
                    new Product(6, "navigatorNavitel.jpg",
                            "GPS навигатор NAVITEL E707 Magnetic",
                            "экран 7'' TFT (800 x 480), processor MStar MSB2531 800 МГц, ssd-memory 8 Гб, Linux",
                            new BigDecimal("342"), 3),
                    new Product(7, "fridgeBosch.jpg",
                            "Холодильник Bosch Serie 6 VitaFresh Plus KGN39AI32R",
                            "freestanding, full No Frost, " +
                                    "electronic control, class A ++, usable volume: 388 l (280 + 108 l), " +
                                    "inverter compressor, freshness zone, reversible doors, folding shelf, " +
                                    "wine shelf, egg tray, finish: anti-fingerprint, 60x66x203 cm, " +
                                    "stainless steel",
                            new BigDecimal("2950"), 4),
                    new Product(8, "fridgeSamsung.jpg",
                            "Refrigerator Samsung RB37A52N0B1/WT",
                            "freestanding, full No Frost, electronically controlled, class A+, " +
                                    "usable volume: 367 l (269 + 98 l), inverter compressor, reversible doors, " +
                                    "tray for eggs, 59.5x64.7x201 cm, black",
                            new BigDecimal("2248"), 4),
                    new Product(9, "carVolvo.jpg",
                            "Volvo XC40", "1.6 T3 MT Turbo Momentum",
                            new BigDecimal("87832"), 5),
                    new Product(10, "carTesla.jpg",
                            "Tesla Model X",
                            "Electrical engine, P100D Long Range",
                            new BigDecimal("272107"), 5),
                    new Product(11, "cameraCanon.jpg",
                            "Reflex camera Canon EOS 4000D Kit 18-55mm III",
                            "SLR camera, Canon EF-S mount, APS-C (1.6 crop) 18 MP sensor," +
                                    " with lens F3.5-5.6 18-55mm, Wi-Fi",
                            new BigDecimal("1449"), 6),
                    new Product(12, "cameraNikon.jpg",
                            "SLR camera Nikon D5600 Kit 18-55mm AF-P DX VR",
                            "SLR camera Nikon D5600 Kit 18-55mm AF-P DX VR",
                            new BigDecimal("2550"), 6)
            );
}
