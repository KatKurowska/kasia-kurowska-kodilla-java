package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public class MailInformationService implements InformationService {

    @Override
    public void confirm(User user, Product product, LocalDate dateOfOrder, boolean isOrdered) {

        System.out.println("Dear "+ user.getName() + " " + user.getSurname() + ",");
        if (isOrdered){
            System.out.println("you have successfully ordered product: " + product.getName() + " (" + dateOfOrder.toString() +")");}
        else {
            System.out.println("an error has occurred, and your order isn't completed. Please, try again or contact our support line.");

        }

    }
}
