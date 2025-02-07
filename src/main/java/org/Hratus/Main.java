package org.Hratus;

public class Main {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        int target = 12;
        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        if(result != -1) {
            System.out.println("Elemento encontrado: " + result2);

        }
        else {
            System.out.println("Elemento nao encontrado");
        }


    }

    //Busca Linear
    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("o numero de passos de busca linear foram: " + steps);
                return i;
            }
        }
       return -1;

    }

    public static int binarySearch(int[] nums, int target) {
        int esquerda = 0;
        int direita = nums.length - 1;
        int steps = 0;

        //{5,6,7,8,9};
        //esquerda é o index inicial da matriz, direita é o ultimo index a partir do 0
        while (esquerda <= direita) {
            steps++;
            int meio = (esquerda + direita) / 2;
            //Se o meio for compadado com o algo, ele retorna o meio
            if (nums[meio] == target) {
                System.out.println("o numero de passos de busca binaria foram: " + steps);
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