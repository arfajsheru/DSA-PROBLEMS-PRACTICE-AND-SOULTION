package in.arfajsheru.array;

class SurfaceAreaOf3DShapes {
    public static void main(String[] args) {
        int[][] grid = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(solution2(grid));
    }

    public  static int solution2(int[][] grid){
        int total = 0;
        int size = grid.length;

        for(int i = 0; i < size; i++){ // ye loop row pe chalgea
            for(int j = 0; j < size; j++){ // ye loop column pe chalega
                if(grid[i][j] == 0) continue; // value equalt to zero to continue karo do
                int areaGainde = 4 * grid[i][j]  + 2;
                int areaLost = 0;

                // Checking for overlap with the uppercell
                if(i - 1 >= 0){
                    areaLost += Math.min(grid[i][j], grid[i - 1][j]);
                }
                // Checking for overlap with the lowercell
                if(i + 1 < size){
                    areaLost += Math.min(grid[i][j], grid[i + 1][j]);
                }
                // Checking for overlap with the leftcell
                if(j - 1 >= 0){
                    areaLost += Math.min(grid[i][j],grid[i][j - 1]);
                }
                // Checking for overlap with the rightcell
                if(j + 1 < size){
                    areaLost += Math.min(grid[i][j], grid[i][j + 1]);
                }

                total += areaGainde - areaLost;
            }
        }
        return total;
    }
}


