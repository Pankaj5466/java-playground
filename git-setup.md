### (a) How to setup github ssh authentiction on local PC GitHub for first-time github setup.

    Answer: 
    - generate a new ssh key. `sh-keygen -t ed25519 -C "your_email@example.com"`
    - open the generated file & enter its content at github.com/settings/ssh/new 
    - If in mac, then press `command + shift + .` to show hidden files.
    [Ressource](https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)


### (b) Setup multiple .gitingore folder for different projects.
    - issue `git init` in parent folder
    - create your child folder like spring-framework in this folder
    - add .gitignore file for folder depedent ignoring.
    - from parent folder issue all git command

    NOTE: its also okay to issue git command from child folder, in this case only lower file changes will be effected for that git command.
    NOTE: the main thing here is that, you should have only ONE .git folder
    & it MUST exist in PARENT FOLDER only.
