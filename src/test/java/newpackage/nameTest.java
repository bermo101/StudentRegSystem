/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.bermingham.studentregsystem.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Brian
 */
public class nameTest {
    
    @Test
    public void testUsername() throws ParseException {
                SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = dateformat.parse("17/07/1989");
                Student testStudent = new Student("Test", "123", 21, date);
		Assert.assertEquals("Test21", testStudent.getUsername());

	}
}
