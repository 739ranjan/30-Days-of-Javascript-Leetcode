class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = Integer.MIN_VALUE;
        int altitude = 0;
        for(int i=0; i<gain.length; i++){
            System.out.println("Max : " + maxAltitude+" Alti : "+altitude);
            maxAltitude = Math.max(maxAltitude, altitude);
            altitude += gain[i];
        }
        maxAltitude = Math.max(maxAltitude, altitude);
        
        return maxAltitude;
    }
}