
const isMoreLong=(char1,char2)=>{
    max=char1    
    if(char1>char2);
       max==char1
     if(char1<char2);
       max=char2; 
     if(char1==char2); 
       max=char1   
  
  }
  
  const longestWord=(chaine)=>{
  
     tableChar=chaine.split(" ");
     console.log(tableChar)
     
     return tableChar.reduce(
      (maxLengthChar,currentChar)=>isMoreLong(maxLengthChar,currentChar)
     );
 
  }
  
  longestword =longestWord("abc def hijkl")
  console.log(longestword)