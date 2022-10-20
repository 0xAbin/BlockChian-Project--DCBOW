public static Boolean isChainVaild(){
    Block currentBlock;
    Block PreviousBlock;



    for(int i = 1; i < blockchain.size(); i++){
        currentBlock = blockcahin.get(i);
        PreviousBlock = blockcahin.get(i-1);

        if(!currentBlock.hash.equals(currentBlock.calculateHash())){
            System.out.println("current hash not equal");
            return false;

        }
        if(!previousHash.hash.equals(currentblock.previousHash)){
            System.out.println("current hash not equal");
            return false;
        }
    }
    return true;
}



