(defproject duckling-rest "0.1.1-SNAPSHOT"
  ; ...project settings...

  :plugins [[lein-ring "0.8.10"]]

  :dependencies [
	  [org.clojure/clojure "1.8.0"]
	  [wit/duckling "1.0.85-SNAPSHOT"]
	  [ring/ring-core "1.2.1"]
	  [ring/ring-jetty-adapter "1.2.1"]
	  [compojure "1.1.6"]
	  [ring/ring-json "0.4.0"]
	  [clj-time "0.12.2"]
  ]

  :main duckling-rest.handler
  
  :ring {:handler duckling-rest.handler/app
         :nrepl {:start? true
                 :port 9998}}
  :profiles {
    :uberjar {:aot :all}
    :dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}}
  :jvm-opts ["-Xmx500m"]
)