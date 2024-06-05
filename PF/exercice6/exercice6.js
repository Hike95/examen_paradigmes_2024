function killerMoreIntelligent(tab,intelligence){
    return intelligence>tab;
 
 }

const killcount=(tab,intelligence)=>{

  return tab.filter(killerMoreIntelligent(tab,intelligence));
    




};


killcount([['Tiffany',4],['Jack',6],['Megan',7],['Tyler',3]],6)