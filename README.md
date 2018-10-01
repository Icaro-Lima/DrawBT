# DrawBT

## Descrição
Um projeto em Java para *desenhar* implementações de árvores binárias.

## Exemplo

### Código
> Main.java
```
public static void main(String[] args) {
  BSTImpl<Integer> bst = new BSTImpl<>(5);

  bst.add(-6);
  bst.add(-7);
  bst.add(-8);
  bst.add(3);
  bst.add(7);
  bst.add(11);
  bst.add(9);
  bst.add(14);
  bst.add(15);

  System.out.println(bst);
}
```

### Saída

```
              ---                 
             | 5 |                
              ---                 
               |                  
           -------                
          /       \               
        ----      ---             
       | -6 |    | 7 |            
        ----      ---             
          |        |              
       ----       -----           
      /    \     /     \          
    ----   ---  --    ----        
   | -7 | | 3 ||  |  | 11 |       
    ----   ---  --    ----        
      |                 |         
    ---               -----       
   /   \             /     \      
 ----  --           ---   ----    
| -8 ||  |         | 9 | | 14 |   
 ----  --           ---   ----    
                            |     
                           ---    
                          /   \   
                         --  ---- 
                        |  || 15 |
                         --  ---- 
```
