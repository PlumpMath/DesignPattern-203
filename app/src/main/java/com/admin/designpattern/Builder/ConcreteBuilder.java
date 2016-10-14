package com.admin.designpattern.Builder;

/**
 * Created by Administrator on 2016/10/14 0014.
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        System.out.println("build part one");
        product.setPart1("part one");
    }

    @Override
    public void buildPart2() {
        System.out.println("build part two");
        product.setPart1("part two");
    }

    @Override
    public void buildPart3() {
        System.out.println("build part three");
        product.setPart1("part three");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
