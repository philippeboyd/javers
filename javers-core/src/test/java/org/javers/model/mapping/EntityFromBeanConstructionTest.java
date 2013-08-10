package org.javers.model.mapping;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author bartosz walacik
 */
@Test
public class EntityFromBeanConstructionTest extends EntityConstructionTest {


    @BeforeMethod
    public void setUp() {
        entityFactory = new BeanBasedEntityFactory();
    }

}
