// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


// doubleX("axxbb") → true
// doubleX("axaxax") → false
// doubleX("xxxxx") → true

boolean doubleX(String str) {
  
    int index = str.indexOf("x");
    if(!str.contains("x") || str.indexOf("x")==str.length()-1)  return false;
    
    for(int i = 0; i< str.length()-1; i++) {
      if(str.substring(index, index+2).equals("xx"))
        return true;
    }
    return false;
  }
  