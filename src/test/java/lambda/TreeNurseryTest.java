package lambda;

import org.junit.jupiter.api.Test;

class TreeNurseryTest {

    @Test
    void pruneTest() {
        TreeNursery treeNursery = new TreeNursery();
        treeNursery.add(new Sapling("a",200));
        treeNursery.add(new Sapling("a",100));
        treeNursery.add(new Sapling("b",300));
        treeNursery.add(new Sapling("c",400));
        treeNursery.prune(50);
        System.out.println(treeNursery.getSaplings());
        treeNursery.sell("a",50);
        System.out.println(treeNursery.getSaplings());
    }
}