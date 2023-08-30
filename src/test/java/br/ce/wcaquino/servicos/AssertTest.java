package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import sun.text.normalizer.IntTrie;

public class AssertTest {

    @Test
    public void Teste(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals(1,1);
        Assert.assertEquals(0.51234, 0.512, 0.001);

        int i = 5;
        Integer i2 = 5;
        Assert.assertEquals(Integer.valueOf(i), i2);
        Assert.assertEquals(i,i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertNotEquals("bola", "casa");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assert.assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario ("Usuario 1");
        Usuario u3 = null;

        Assert.assertEquals(u1,u2);

        Assert.assertSame(u2,u2);
        Assert.assertNotSame(u1,u2);

        Assert.assertNull(u3);
        Assert.assertNotNull(u2);


    }

}
