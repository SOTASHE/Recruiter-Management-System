package OrmMapping;
// Generated Mar 12, 2017 2:39:06 AM by Hibernate Tools 4.3.1



/**
 * CandidatesJobs generated by hbm2java
 */
public class CandidatesJobs  implements java.io.Serializable {


     private CandidatesJobsId id;
     private Candidates candidates;
     private Jobs jobs;
     private boolean satisfaction;

    public CandidatesJobs() {
    }

    public CandidatesJobs(CandidatesJobsId id, Candidates candidates, Jobs jobs, boolean satisfaction) {
       this.id = id;
       this.candidates = candidates;
       this.jobs = jobs;
       this.satisfaction = satisfaction;
    }
   
    public CandidatesJobsId getId() {
        return this.id;
    }
    
    public void setId(CandidatesJobsId id) {
        this.id = id;
    }
    public Candidates getCandidates() {
        return this.candidates;
    }
    
    public void setCandidates(Candidates candidates) {
        this.candidates = candidates;
    }
    public Jobs getJobs() {
        return this.jobs;
    }
    
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
    public boolean isSatisfaction() {
        return this.satisfaction;
    }
    
    public void setSatisfaction(boolean satisfaction) {
        this.satisfaction = satisfaction;
    }




}


