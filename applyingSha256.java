public String calculateHash() {
    String calculateHash = StringUtil.applySha256(previousHash + Lonf.toString(timestamp) + data );
    
    
    return calculateHash;
}