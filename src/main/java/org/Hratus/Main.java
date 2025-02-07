package org.Hratus;

public class Main {
    public static void main(String[] args) {

        int nums[] = {5,6,7,8,9};

        int target = 5;
        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        if(result != -1) {
            System.out.println("Elemento encontrado: " + result2);
            System.out.println(nums.length);
        }
        else {
            System.out.println("Elemento nao encontrado");
        }


    }

    //Busca Linear
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
       return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int esquerda = 0;
        int direita = nums.length - 1;

        //{5,6,7,8,9};
        //esquerda é o index inicial da matriz, direita é o ultimo index a partir do 0
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            //Se o meio for compadado com o algo, ele retorna o meio
            if (nums[meio] == target) {
                return meio;

            }
            //caso o meio foi menor que o alvo e o alvo e esteja a direita. A esqueda passa a ser o meio+1, removendo os numeros a esquerda do novo meio
            else if (nums[meio] < target) {
                esquerda = meio + 1;
            }
            //caso o alvo esteja a esquerda, a direita passa a ser o meio-1, removendo os numeros a direita do novo meio
            else {
                direita = meio - 1;
            }
        }




        return -1;
    }
}