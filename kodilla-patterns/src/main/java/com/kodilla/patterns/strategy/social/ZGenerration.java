package com.kodilla.patterns.strategy.social;

public class ZGenerration extends User  {
    public ZGenerration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
