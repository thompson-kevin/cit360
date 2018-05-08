/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.tests;

import junit.MathHelpers;
import junit.NumberAndItsSquare;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Kevin's Account
 */
public class MathHelperTests {
    @Test
    public void findSquareRootOfNine() {
        double number = 9;
        double answer = MathHelpers.squareRoot(number);
        assertEquals(3, answer, 0);
    }
    
    @Test
    public void findThirdTriangleSide() {
        NumberAndItsSquare[] triangleInformation = new NumberAndItsSquare[3];
        NumberAndItsSquare[] expectedTriangle = new NumberAndItsSquare[3];
        NumberAndItsSquare expectedSideA = new NumberAndItsSquare(3, 9);
        NumberAndItsSquare expectedSideB = new NumberAndItsSquare(4, 16);
        NumberAndItsSquare expectedSideC = new NumberAndItsSquare(5, 25);
        
        for (NumberAndItsSquare nais : triangleInformation) {
            assertNull(nais);    
        }
        
        expectedTriangle[0] = expectedSideA;
        expectedTriangle[1] = expectedSideB;
        expectedTriangle[2] = expectedSideC;
        
        double lengthA = 3;
        double lengthB = 4;
        
        NumberAndItsSquare sideA = new NumberAndItsSquare(lengthA, MathHelpers.getFactor(lengthA, 2));
        NumberAndItsSquare sideB = new NumberAndItsSquare(lengthB, MathHelpers.getFactor(lengthB, 2));
        NumberAndItsSquare sideC = new NumberAndItsSquare(MathHelpers.findMissingTriangleSide(lengthA, lengthB), 
                MathHelpers.getFactor(MathHelpers.findMissingTriangleSide(lengthA, lengthB), 2));
        
        triangleInformation[0] = sideA;
        triangleInformation[1] = sideB;
        triangleInformation[2] = sideC;
        assertNotNull(triangleInformation[2]);
        
        for (int i = 0; i < 3; i++) {
            assertNotSame(expectedTriangle, triangleInformation);
        }
        NumberAndItsSquare[] copiedTriangle = triangleInformation;
        assertArrayEquals(copiedTriangle, triangleInformation);
    }
}
