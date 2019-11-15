/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import entity.EmsEmployeeDTO;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import web.EmsEmployeeManagedBean;
import org.mockito.junit.MockitoJUnitRunner;
import session.EmsEmployeeFacadeRemote;

/**
 *
 * @author dara
 */
@RunWith(MockitoJUnitRunner.class)
public class TestAddress {

    public TestAddress() {
    }

    @Mock
    private EmsEmployeeFacadeRemote emsEmployeeFacade;

    @InjectMocks
    private EmsEmployeeManagedBean managedBean;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        managedBean.setEmpid("001111"); //valid input
        managedBean.setName("a");
        managedBean.setPassword("a");
        managedBean.setcPassword("a");
        managedBean.setEmail("a");
        managedBean.setPhone("a");
        managedBean.setAddress("a");
        managedBean.setSecqn("a");
        managedBean.setSecans("a");
        managedBean.setBsbid("a");
        managedBean.setAccid("a");
        managedBean.setSalary(new BigDecimal(1000)); //valid input
        managedBean.setAppgroup("ED-EMS-USERS"); //valid input
        managedBean.setActive(true);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIsValidAddress01() {
        boolean expected = false;
        String address = null;
        boolean actual = managedBean.isValidAddress(address);
        assertEquals(expected, actual);

    }

    @Test
    public void testIsValidAddress02() {
        boolean expected = true;
        String address = "a";
        boolean actual = managedBean.isValidAddress(address);
        assertEquals(expected, actual);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
