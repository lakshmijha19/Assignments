class  rectangle
{
    constructor(width,height)
    { 
        this.width=width;
        this.height=height;
    }

    get area()
    {
        return this.calculate();
    }

    calculate()
    {
        return this.width*this.height;
    }

 }

const r = new rectangle(10,10);
console.log(r.area);

