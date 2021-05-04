public static int countingValleys(int steps, String path) {
// Write your code here
    int level = 0;//sea level
    int numVallies = 0;//number of times you exit a valley

    for (int i = 0; i < steps; i++) {
        if (path.charAt(i) == 'U') level++;//chech if you are going up, if not, then you are surely going down
        else level--;

        if (level == 0 && path.charAt(i) == 'U') numVallies++;//if the lastting you did was go up and you are at sealevel, count as valley
    }

    return numVallies;
}



// An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly STEPS steps, for every step it was noted if it was an uphill, , or a downhill, step. Hikes always start and end at sea level, and each step up or down represents a
//
// unit change in altitude. We define the following terms:
//
//     A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//     A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//
// Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
//
// Example
//
// The hiker first enters a valley units deep. Then they climb out and up onto a mountain
//
// units high. Finally, the hiker returns to sea level and ends the hike.
//
// Function Description
//
// Complete the countingValleys function in the editor below.
//
// countingValleys has the following parameter(s):
//
//     int steps: the number of steps on the hike
//     string path: a string describing the path
//
// Returns
//
//     int: the number of valleys traversed
//
