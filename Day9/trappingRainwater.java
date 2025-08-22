package Day9;
public class trappingRainwater{
    public static void TrappingRainwater(int height[]){
        //most water = most area
        //area = maxheight*maxwidth
        //maxheight = min(left,right)
        //maxwidth = idx(right)-idx(left)
        int maxArea = 0;
        int i =0;
        int j = height.length-1;
        int left = height[i];
        int right = height[j];
        int maxheight = Math.min(left, right);
        int maxwidth = j-i;
        int area = maxheight*maxwidth;
        if(area>maxArea){
            maxArea = area;
        }
        while(i != j){
            //find maximum of left and right
            if(Math.max(left,right) == right){
                i++;
                left = height[i];
                maxheight = Math.min(left, right);
                maxwidth = j-i;
                area = maxheight*maxwidth;
                if(area>maxArea){
                    maxArea = area;
                } 
            }    
            else{
                j--;
                right = height[j];
                maxheight = Math.min(left, right);
                maxwidth = j-i;
                area = maxheight*maxwidth;
                if(area>maxArea){
                    maxArea = area;
                } 
            }
        }
        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int height[] = {1,1};
        TrappingRainwater(height);
    }
}