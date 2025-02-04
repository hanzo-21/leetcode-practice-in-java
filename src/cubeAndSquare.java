public class cubeAndSquare {
        public static boolean isCubeAndSquare(int num) {
            int root =(int) Math.sqrt(num);
            if(Math.pow(root,2) != num){
                return false;
            }
            root = (int) Math.cbrt(num);
            if(Math.pow(root,3) !=num){
                return false;
            }
            return true;
        }
}
