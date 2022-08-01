package company;

import company.Products;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-04-23T06:26:15", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Catagories.class)
public class Catagories_ { 

    public static volatile CollectionAttribute<Catagories, Products> productsCollection;
    public static volatile SingularAttribute<Catagories, String> name;
    public static volatile SingularAttribute<Catagories, BigDecimal> id;

}