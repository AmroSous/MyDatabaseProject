package company;

import company.Orders;
import company.Products;
import company.Warehouses;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-23T06:26:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Orderitems.class)
public class Orderitems_ { 

    public static volatile SingularAttribute<Orderitems, BigInteger> quantity;
    public static volatile SingularAttribute<Orderitems, Products> productId;
    public static volatile SingularAttribute<Orderitems, Orders> orderId;
    public static volatile SingularAttribute<Orderitems, Warehouses> warehouseId;
    public static volatile SingularAttribute<Orderitems, BigDecimal> id;

}