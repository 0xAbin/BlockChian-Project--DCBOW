public class abinchain {
    public static void main(String[] args) {
        Block genesisBlock = new Block("HI abin testing","0");
        System.out.println("hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("sheesh i am the abin 2",genesisBlock.hash);
        System.out.println("hash for block 2 : " + genesisBlock.hash);

        Block thirdBlock = new Block("suiiii abin 3",secondBlock.hash);
        System.out.println("hash for block 3 : " + genesisBlock.hash);
    }
}