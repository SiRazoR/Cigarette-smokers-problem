# Cigarette-smokers-problem
Prosta aplikacja wielowątkowa napisana w trakcie studiów w języku java mająca na celu graficzne rozwiazanie "[Cigarette smokers problem](https://en.wikipedia.org/wiki/Cigarette_smokers_problem)".
Problemu w którym należy zapobiec zakleszczeniu wątków(deadlock).

### Opis zagadnienia

W systemie są trzy procesy typu Palacz oraz jeden proces typu Agent. Każdy Palacz
chciałby bez przerwy skręcać papierosy i wypalać je. Czynność ta wymaga posiadania
trzech składników: tytoniu, papieru, zapałki. Jeden Palacz ma tytoń, drugi – papier, a trzeci
zapałki. Każdy z Palaczy ma nieskończenie wielkie zasoby „swojego” składnika i żadnych
zapasów pozostałych składników. W zaspokojeniu pragnień palaczy pomaga Agent, który
kładzie na stole dwa składniki(wybrane losowo). Palacz, który ma trzeci składnik zabiera ze
stołu pozostałe dwa, skręca papierosa i wypala go. Agent czeka, aż Palacz skończy się
delektować. Następnie cały cykl się powtarza w nieskończoność. 

 ### Podgląd projektu
 Prędkość x2
![](https://github.com/SiRazoR/Cigarette-smokers-problem/blob/master/smoker.gif?raw=true)
