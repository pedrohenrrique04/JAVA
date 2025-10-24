package DesafiosIniciante;

public abstract class Mission {
    private String missionName;
    private String difficultyLevel;
    private String completionStatus;

    public Mission(String missionName, String difficultyLevel, String completionStatus) {
        this.missionName = missionName;
        this.difficultyLevel = difficultyLevel;
        this.completionStatus = completionStatus;
    }

    public String getMissionName() {
        return missionName;
    }
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }
    public String getDifficultyLevel() {
        return difficultyLevel;
    }
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public String getCompletionStatus() {
        return completionStatus;
    }
    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    @Override
    public String toString() {
        return "Mission Name is: " + missionName +
                ", difficulty level is: " + difficultyLevel +
                ", completion status is: " + completionStatus + ", ";
    }
}
