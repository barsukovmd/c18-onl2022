package by.tms.shuttle.service;

//Создаем интерфейс IStart. В интерфейсе определяем методы: • предстартовая проверка систем(возвращает true/false)
////        • запуск двигателей(void)
////        • старт(void)
public interface IStart {
    boolean checkPreStart();

    void engineOn();

    void start();
}
