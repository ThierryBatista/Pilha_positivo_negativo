package controller;
import model.PilhaInt;

public class PosiNegPilhaController
{
 public PosiNegPilhaController()
 {
 super();
 }

 public void PilhaPN(int[] vet)
 {
 int tamanho = vet.length - 1;
 PilhaInt p = new PilhaInt();

  for (int i = 0; i < tamanho; i++)
  {
   if (vet[i] >= 0)
   {
   p.push(vet[i]);
   } else
     {
      int a = 0, b = 0;
      
	try {
		a = p.pop();
		 b = p.pop();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      int soma = a + b;
      p.push(soma);
     }
  }
  System.out.println("A quantidade de valores na pilha é de " + p.size());
 }
}