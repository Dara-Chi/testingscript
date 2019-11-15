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
public class TestPasswordMatching {

    public TestPasswordMatching() {
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
    }

    @After
    public void tearDown() {
    }

    public void testIsPasswordMatching01() {
        boolean expected = false;
        String password = "a ";
        String cpassword = "b";
        boolean actual = managedBean.isPasswordMatching(password.trim(), cpassword.trim());
        assertEquals(expected, actual);
    }

    @Test
    public void testIsPasswordMatching02() {
        boolean expected = true;
        String password = " q";
        String cpassword = "q ";
        boolean actual = managedBean.isPasswordMatching(password.trim(), cpassword.trim());
        assertEquals(expected, actual);
    }
}
