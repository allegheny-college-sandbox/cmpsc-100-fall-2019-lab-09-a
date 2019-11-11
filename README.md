# CMPSC 100-03 Lab Session 9: G. Wiz (or, should I say, Rad Gator Wiz) hides from the tax authorities
* Assigned: 11 November 2019
* Due: 18 November 2019
* Point value: 45 pts

In this laboratory session, we explore topics including: 

* An introduction to the idea of an "algorithm"
* More practice using `for` loops
* Additional work with dimensional arrays

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## G. Wiz (or, should I say, Rad Gator Wiz) hides from the tax authorities

One could characterize G. Wiz's last few weeks as extremely successful; he's won some money on a game show, established himself as a puzzle master, and explored some other areas of generating side income. Despite his lack of acknowledgment that has to hustle so hard just to feed a burgeoning habit for purchasing hats, one could say that G. Wiz is becoming a gator of means.

But, with such notoriety comes some level of suspicion. The Gator Office of Taxes, Cash, and Allocations (GOTCHA) noticed that G. Wiz hasn't been filing taxes on any of his recent gains!

To avoid audit by GOTCHA, G. Wiz plans to change his name to some really hip anagram of `Gator Wizard` when he publishes in the local paper and lists his courses at the local wizard college so that he won't be so trackable. He needs your help to make sure that it's truly an anagram because -- of course -- no one will think of that.

### A brief primer on anagrams

If you're unsure as to what constitutes an anagram -- never fear! An anagram is simply a word or word(s) rearranged using all of its letters to form other words. When they're at their best, they can be somewhat humorous, such as:

```
SLOT MACHINES -> CASH LOST IN ME
```

(But, don't go telling G. Wiz about that one -- he might get some ideas for future income streams.)

Insofar as Java is concerned, remember that `Strings` are merely `chars` which really represent `int` values in the "ASCII" table. Also keep in mind that if two phrases or words contain a different amount of letters, they can't be anagrams.

So, my hint to you (in the form of a question):

> Can strings be sorted numerically?

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `AnagramTest.java`

This file should attempt an `iterative` solution to the problem.

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Leverages single-line comments throughout to describe or detail functionality (minimum 5)
- [ ] Contains a complete `sort` method with the correct `return` type which should:
* This method should take one parameter (a one-dimensional `array`) of the correct type (see the constructor for a hint)
* This method _should not_ be visible outide of the class
* Loop over the array twice to complete sort
* Return the sorted array
- [ ] Implements a `true`/`false` test in a method called `testWords` which determines whether or not a pair of words are anagrams; this method should:
* Take no parameters
* Return the result of various `true`/`false` conditions to determine anagram status

### `TestAnagram.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Contains a complete `main` method
- [ ] Leverages single-line comments throughout to describe or detail functionality (minimum 4)
- [ ] Successfully reads and iterates over lines from a file located at `inputs/names.list`
- [ ] Contains a correct call to `AnagramTest` class using `Gator Wizard` as the name to compare to the various names in `names.list`
- [ ] Uses the `testWords` method of `AnagramTest` to determine if the latest pair of names are anagrams

The output should be _similar_ to:

```
NAME            IS ANAGRAM
----            ----------
Art Go Wiz      NO
Lag Tailor      NO
Largo Tail      NO
I All Gator Wiz NO
Alligator Wiz   NO
Rad Gator Wiz   YES
A Ill Gator     NO
Grad Wiz        NO
Alligator Rad   NO
Wiz Largo Tail  NO
```

### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 10 headings
- [ ] Uses at least 2 code blocks
- [ ] Responds to _all_ questions

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`