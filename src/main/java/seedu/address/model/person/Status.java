package seedu.address.model.person;

/**
 * Represents a Task's status in the task list.
 */

public class Status {

    private boolean isDone;

    /**
     * Constructs a {@code Status}.
     */
    public Status() {
        this.isDone = false;
    }

    /**
     * Returns true if isDone is true.
     */
    public boolean hasFinished() {
        return this.isDone;
    }

    /**
     * Mark the task's status as finished.
     */
    public void finishTask() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return isDone ? "Finished" : "Unfinished";
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Status // instanceof handles nulls
                && (isDone == (((Status) other).isDone))); // state check
    }

}
