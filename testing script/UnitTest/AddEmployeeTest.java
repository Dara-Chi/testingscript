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
//@RunWith(MockitoJUnitRunner.class)
public class AddEmployeeTest {
    
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

    @Before//set up a set of valid input for DTO to run in the add employee test cases  
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
    public void testIsAddEmsEmployee01() {
        managedBean.setEmpid(null); //invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee02() {

        managedBean.setEmpid("000000"); //invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee03() {

        managedBean.setEmpid("000001"); //invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee04() {
        managedBean.setEmpid("001100"); //invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee05() {

        managedBean.setEmpid(" "); //invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee06() {
        
        managedBean.setEmpid("001101"); //valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee07() {
        managedBean.setName(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee08() {
        managedBean.setPassword(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());

    }

    @Test
    public void testIsAddEmsEmployee09() {
        managedBean.setcPassword(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        

    }

    @Test
    public void testIsAddEmsEmployee10() {
        managedBean.setEmail(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
       
    }

    @Test
    public void testIsAddEmsEmployee11() {
        managedBean.setPhone(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());

    }

    @Test
    public void testIsAddEmsEmployee12() {
        managedBean.setAddress(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
       

    }

    @Test
    public void testIsAddEmsEmployee13() {
        managedBean.setSecqn(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
       
    }

    @Test
    public void testIsAddEmsEmployee14() {
        managedBean.setSecans(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }

    @Test
    public void testIsAddEmsEmployee15() {
        managedBean.setBsbid(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }

    @Test
    public void testIsAddEmsEmployee16() {
        managedBean.setAccid(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }

    @Test
    public void testIsAddEmsEmployee17() {
        managedBean.setEmail(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }
    
    @Test
    public void testIsAddEmsEmployee18() {
        managedBean.setSalary(new BigDecimal(-1000));//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }
    
    @Test
    public void testIsAddEmsEmployee19() {
        managedBean.setSalary(new BigDecimal(1000));//valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
        
    }
    @Test
    public void testIsAddEmsEmployee20() {
        managedBean.setSalary(new BigDecimal(1000.00));//valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
        
    }
    
    
    
    @Test
    public void testIsAddEmsEmployee21() {
        managedBean.setAppgroup(null);//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }
    
    @Test
    public void testIsAddEmsEmployee22() {
        managedBean.setAppgroup(" ");//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
        
    }
    
    @Test
    public void testIsAddEmsEmployee23() {
        managedBean.setAppgroup("#");//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }
    
    @Test
    public void testIsAddEmsEmployee24() {
        managedBean.setAppgroup("ED-EMS-NONE");//invalid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(false);
        assertEquals("failure", managedBean.addEmsEmployee());
    }
    @Test
    public void testIsAddEmsEmployee25() {
        managedBean.setAppgroup("ED-EMS-ADMIN");//valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
    }
    
    @Test
    public void testIsAddEmsEmployee26() {
        managedBean.setAppgroup("ED-EMS-USERS");//valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
    }
    
    @Test 
    public void testIsAddEmsEmployee27() { // valid input
        when(emsEmployeeFacade.createRecord(any(EmsEmployeeDTO.class))).thenReturn(true);
        assertEquals("success", managedBean.addEmsEmployee());
    }
    
    
    
}
