# Recruitment-Software

## Features
This project is a desktop application that enable recruiters to find the best fit for any job using keywords. The application scrape many linkedin profiles that have applied to a given job ( linkedin url provided from DB ) and order the candidates of this job by score. The score for each candidate is calculated using this matrix:

Principal Skills keyword:

| Linkedin Skills  | Linkedin Projects |
| -------------    | -------------     |
| .    3           |        5          |

Secondary Skills keywords:

| Linkedin Skills  | Linkedin Projects |
| ------------- | -------------        |    
| 2             |            3         |
