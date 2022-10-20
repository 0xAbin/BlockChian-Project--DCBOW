public Block(String data,String previousHash){
    this.data =data;
    this.previousHash = previousHash;
    this.timestamp = new Date().getTime();
    this.hash =calculateHash();
}