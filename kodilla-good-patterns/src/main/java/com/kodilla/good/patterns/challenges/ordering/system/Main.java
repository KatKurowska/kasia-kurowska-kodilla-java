package com.kodilla.good.patterns.challenges.ordering.system;

public class Main {

    public static void main(String[] args) {

        OrderData orderData = new OrderData();
        Order order = orderData.create();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailInformationService(), new GameOrderService(),
                new OrderRepositorySaver());

        productOrderProcessor.process(order);

    }
}
