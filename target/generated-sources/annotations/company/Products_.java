package company;

import company.Brands;
import company.Catagories;
import company.Orderitems;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-23T06:26:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> color;
    public static volatile SingularAttribute<Products, BigInteger> price;
    public static volatile SingularAttribute<Products, Brands> brandId;
    public static volatile CollectionAttribute<Products, Orderitems> orderitemsCollection;
    public static volatile SingularAttribute<Products, BigDecimal> id;
    public static volatile SingularAttribute<Products, Catagories> catagoryId;

}