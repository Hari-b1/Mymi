const {Command} = require('commander');
const program = new Command();

const book = {fantasy :['Harry Potter']}

program.command('ADD')
    .description("Add a book in the library")
    .argument('<string>', "add the book name")
    .action(function(str){
        book.fantasy.push(str)
        console.log(`Book added : ${str} `);

    });

program.command('VIEW')
    .description("Viewing the books in the library.")
    .action(function(){
        for(let i = 0; i < book.fantasy.length; i ++){
            console.log(book.fantasy[i]);
        }
    })

program.parse();

