package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(1, "Gabriel", "gabriel@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
