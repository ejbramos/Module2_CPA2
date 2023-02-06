import static org.junit.jupiter.api.Assertions.*;

class operationsTest {
    operations op = new operations();
    boolean[] p = {false, false, true, true};
    boolean[] q = {false, true, false, true};

    @org.junit.jupiter.api.Test
    void not() {
        assertEquals(true,op.not(p[0]));
        assertEquals(true,op.not(p[1]));
        assertEquals(false,op.not(p[2]));
        assertEquals(false,op.not(p[3]));

    }

    @org.junit.jupiter.api.Test
    void and() {
        assertEquals(false,op.and(p[0],q[0]));
        assertEquals(false,op.and(p[1],q[1]));
        assertEquals(false,op.and(p[2],q[2]));
        assertEquals(true,op.and(p[3],q[3]));

    }

    @org.junit.jupiter.api.Test
    void or() {
        assertEquals(false,op.or(p[0],q[0]));
        assertEquals(true,op.or(p[1],q[1]));
        assertEquals(true,op.or(p[2],q[2]));
        assertEquals(true,op.or(p[3],q[3]));
    }

    @org.junit.jupiter.api.Test
    void exOr() {
        assertEquals(false,op.exOr(p[0],q[0]));
        assertEquals(true,op.exOr(p[1],q[1]));
        assertEquals(true,op.exOr(p[2],q[2]));
        assertEquals(false,op.exOr(p[3],q[3]));
    }

    @org.junit.jupiter.api.Test
    void nand() {
        assertEquals(true,op.nand(p[0],q[0]));
        assertEquals(true,op.nand(p[1],q[1]));
        assertEquals(true,op.nand(p[2],q[2]));
        assertEquals(false,op.nand(p[3],q[3]));
    }

    @org.junit.jupiter.api.Test
    void nor() {
        assertEquals(true,op.nor(p[0],q[0]));
        assertEquals(false,op.nor(p[1],q[1]));
        assertEquals(false,op.nor(p[2],q[2]));
        assertEquals(false,op.nor(p[3],q[3]));
    }

    @org.junit.jupiter.api.Test
    void then() {
        assertEquals(true,op.then(p[0],q[0]));
        assertEquals(true,op.then(p[1],q[1]));
        assertEquals(false,op.then(p[2],q[2]));
        assertEquals(true,op.then(p[3],q[3]));

    }

    @org.junit.jupiter.api.Test
    void biCon() {
        assertEquals(true,op.biCon(p[0],q[0]));
        assertEquals(false,op.biCon(p[1],q[1]));
        assertEquals(false,op.biCon(p[2],q[2]));
        assertEquals(true,op.biCon(p[3],q[3]));

    }
}