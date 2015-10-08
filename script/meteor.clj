(require '[cljs.build.api :as b])

(b/build "src/meteor"
  {:output-to "meteor.js"
   :target :nodejs
   :optimizations :simple
   :static-fns true
   :cache-analysis true
   :pretty-print true
   :optimize-constants true
   :verbose true})

(System/exit 0)
