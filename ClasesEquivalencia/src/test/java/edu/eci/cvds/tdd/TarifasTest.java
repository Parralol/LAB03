package edu.eci.cvds.tdd;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
public class TarifasTest {
    

    @Test
    public void shouldApplyMinorityAgeDiscount(){
        double res = CalculadorDescuentos.calculoTarifa(123456, 15 ,0);
        Assert.assertTrue(Double.toString(res), (res== 117283.20000));
    }
    @Test
    public void shouldApplySixtyFive(){
        double res = CalculadorDescuentos.calculoTarifa(123456, 15 ,66);
        Assert.assertTrue(Double.toString(res), (res== 117283.20000));
    }
    @Test
    public void ShouldDiscountDiasAntelacion(){
        double res = CalculadorDescuentos.calculoTarifa(123456, 15 ,0);
        Assert.assertTrue(Double.toString(res), (res== 104937.6));
    }
    @Test
    public void shouldApplyMinorityAndDiasAntelacion(){
        double res = CalculadorDescuentos.calculoTarifa(123456, 21 ,66);
        Assert.assertTrue(Double.toString(res), (res== 95061.12));
    }
}
