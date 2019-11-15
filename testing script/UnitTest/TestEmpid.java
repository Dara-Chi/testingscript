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
public class TestEmpid {
    
    public TestEmpid() {
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
    public void testIsValidUserid01() {
        boolean expected = false;
        boolean actual = managedBean.isValidUserid(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidUserid02() {
        boolean expected = false;
        boolean actual = managedBean.isValidUserid(" ");
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidUserid03() {
        boolean expected = false;
        boolean actual = managedBean.isValidUserid("-000001");
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidUserid04() {
        boolean expected = false;
        boolean actual = managedBean.isValidUserid("0000001");
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidUserid05() {
        boolean expected = false;
        boolean actual = managedBean.isValidUserid("1");
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidUserid06() {
        boolean expected = true;
        boolean actual = managedBean.isValidUserid("001101");
        assertEquals(expected, actual);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
