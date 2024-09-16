package view;
import controller.PosiNegPilhaController;

public class PosiNegPilha {
	 public static void main(String Args[])
	 {
	  PosiNegPilhaController pn = new PosiNegPilhaController();
	  int[] vet = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
	  pn.PilhaPN(vet);
	 }
}
