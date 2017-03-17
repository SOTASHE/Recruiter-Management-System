require 'linkedin-scraper'

profile = Linkedin::Profile.new("http://www.linkedin.com/in/jeffweiner08", { proxy_ip: '50.31.9.220', proxy_port: '3128', username: '78087', password: '78087' })
puts profile.to_json
