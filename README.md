# Recruitment-Software
Please note that we use this project for a school project and we do not have the financial means to access to APIS. So we have choosen to scrap LinkedIn data from 5 profils just to succeed the demonstration and not for commercial use. 

Please note also that LinkedIn block ip after 10 successive requests.  So it is not really scraping !

## Features
This project is a desktop application that enable recruiters to find the best fit for any job using keywords. The application scrape many linkedin profiles of candidates who have applied to a given job offer ( linkedin url provided from DB ) and sort the candidates of this job by candidate's score. The score for each candidate is calculated using this weighted matrix:

* Principal Skills keyword ( If Principal skills match  with Linkedin Skills or Linkedin Projects of a given profil )

| Linkedin Skills  | Linkedin Projects |  
| -------------    | -------------     |
| .    3           |        5          |

* Secondary Skills keywords  ( If Secondary skills match  with Linkedin Skills or Linkedin Projects of a given profil )

| Linkedin Skills  | Linkedin Projects |
| ------------- | -------------        |    
| 2             |            3         |


* After that we calculate the total weighted for each candidate and we sort them based on this criteria.
