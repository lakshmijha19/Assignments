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

const r = new rectangle(4,5);
r.height=50;
console.log(r.area);

