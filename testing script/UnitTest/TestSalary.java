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
public class TestSalary {
    
    public TestSalary() {
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

    //test salary input pattern
    @Test
    public void testIsValidSalary01() {
        boolean expected = false;
        boolean actual = managedBean.isValidSalary(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testisValidSalary02() {
        boolean expected = false;
        BigDecimal salary = new BigDecimal(0);
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

    @Test
    public void testisValidSalary03() {
        boolean expected = false;
        BigDecimal salary = new BigDecimal(-1);
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidSalary04() {
        boolean expected = false;
        BigDecimal salary = new BigDecimal("");
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidSalary05() {
        boolean expected = true;
        BigDecimal salary = new BigDecimal(1);
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidSalary06() {
        boolean expected = false;
        BigDecimal salary = new BigDecimal(100000000);
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidSalary07() {
        boolean expected = true;
        BigDecimal salary = new BigDecimal(10000000);
        boolean actual = managedBean.isValidSalary(salary);
        assertEquals(expected, actual);
    }

}
