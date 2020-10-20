package com.kodilla.good.patterns.challenges.ordering.system;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(final Order order) {

        boolean isOrdered = orderService.order(order.getProduct(), order.getUser(), order.getDateOfOrder());

        if (isOrdered) {
            informationService.confirm(order.getUser(), order.getProduct(), order.getDateOfOrder(), isOrdered);
            orderRepository.saveOrder(order.getUser(), order.getDateOfOrder());
        } else {
            informationService.confirm(order.getUser(), order.getProduct(), order.getDateOfOrder(), isOrdered);
        }
    }
}
