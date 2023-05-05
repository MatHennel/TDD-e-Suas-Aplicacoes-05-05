package ifpr.pgua.tads;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilhaTeste {

    private Pilha p;

    @BeforeEach
    public void criaPilha(){
        p = new Pilha();
    }
    

    @Test
    public void verificaPilhaVazia(){
        //cenario
        


        //açao + verificacao
        assertTrue(p.estaVazia());
        assertEquals(0,p.tamanho());
    }

    @Test
    public void empilhaElemento(){
        //cenario
        

        //ação
        p.empilhar("um");

        //verificação
        assertFalse(p.estaVazia());
        assertEquals(1,p.tamanho());
        assertEquals("um",p.topo());
    }

    @Test
    public void empilharDoisDesempilharUm(){
        //cenario
       
        p.empilhar("primeiro");
        p.empilhar("segundo");


        //verificacao
        

        assertFalse(p.estaVazia());
        assertEquals(2,p.tamanho());
        assertEquals("segundo",p.topo());

        //ação
       Object retorno = p.desempilhar();

       //verificação
       assertEquals(1,p.tamanho());
       assertEquals("segundo",retorno);
       assertEquals("primeiro",p.topo());


    }

}
